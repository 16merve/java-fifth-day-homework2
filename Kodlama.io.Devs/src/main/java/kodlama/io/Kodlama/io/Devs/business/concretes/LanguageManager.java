package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	private TechnologyRepository technologyRepository;
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		languageRepository.save(language);
		
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		@SuppressWarnings("deprecation")
		Language language = languageRepository.getById(deleteLanguageRequest.getId());
		technologyRepository.deleteAll();
		languageRepository.delete(language);
		
		
	}
	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		@SuppressWarnings("deprecation")
		Language language = languageRepository.getById(updateLanguageRequest.getId());
		language.setName(updateLanguageRequest.getName());
		languageRepository.save(language);
	}



	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();
		for(Language language: languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languagesResponse.add(responseItem);
	}
		return languagesResponse;
	}


	@Override
	public List<GetAllLanguagesResponse> getById(int id) {
		Optional<Language> language = languageRepository.findById(id);
		GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
		responseItem.setName(language.get().getName());
		return null;
		
	}
	 


}
