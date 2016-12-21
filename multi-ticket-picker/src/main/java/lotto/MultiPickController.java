package lotto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiPickController {

	private MultiPicker multiPicker;

	@Autowired
	public MultiPickController(MultiPicker multiPicker) {
		this.multiPicker = multiPicker;
	}
	
	@GetMapping("/pick")
	public List<int[]> pick() {
		return multiPicker.pick();
	}
	
}
