package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;


public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();

	void add(CreateTechnologyRequest createTechnologyRequest);

	void delete(DeleteTechnologyRequest deleteLanguageRequest);

	void update(UpdateTechnologyRequest updateLanguageRequest);

	

	
}
