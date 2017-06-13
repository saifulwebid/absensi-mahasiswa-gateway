package polban.jtk.absensimahasiswa.gateway.controller;

import polban.jtk.absensimahasiswa.gateway.response.Kelas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KelasController {

	@RequestMapping("/kelas")
	public List<Kelas> getAllKelas() {
		List<Kelas> list = new ArrayList<Kelas>();

		list.add(new Kelas("1", "1A-D4"));
		list.add(new Kelas("2", "2A-D4"));
		list.add(new Kelas("3", "3A-D4"));
		list.add(new Kelas("4", "4A-D4"));
		list.add(new Kelas("5", "1A-D3"));
		list.add(new Kelas("6", "2A-D3"));
		list.add(new Kelas("7", "3A-D3"));
		list.add(new Kelas("8", "1B-D3"));
		list.add(new Kelas("9", "2B-D3"));
		list.add(new Kelas("10", "3B-D3"));
		
		return list;
	}
	
}
