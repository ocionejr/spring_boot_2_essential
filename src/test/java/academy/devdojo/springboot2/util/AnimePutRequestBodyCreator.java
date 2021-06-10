package academy.devdojo.springboot2.util;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.request.AnimePutRequestBody;

public class AnimePutRequestBodyCreator {

    public static AnimePutRequestBody createAnimePutRequestBody(){
        Anime anime = AnimeCreator.createValidAnime();

        return AnimePutRequestBody.builder()
                .name(anime.getName())
                .id(anime.getId())
                .build();
    }

}
