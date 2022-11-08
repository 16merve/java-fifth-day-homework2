package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;


public interface LanguageService {
     List<GetAllLanguagesResponse> getAll();

	void add(CreateLanguageRequest createLanguageRequest);

	void delete(DeleteLanguageRequest createLanguageRequest );

	void update(UpdateLanguageRequest createLanguageRequest);

	

	List<GetAllLanguagesResponse> getById(int id);

}
