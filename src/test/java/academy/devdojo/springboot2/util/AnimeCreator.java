package academy.devdojo.springboot2.util;

import academy.devdojo.springboot2.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved(){
        return Anime.builder().name("Hajime No Ippo").build();
    }

    public static Anime createValidAnime(){
        return Anime.builder()
                .name("Hajime No Ippo")
                .id(1L)
                .build();
    }

    public static Anime createValidUpdatedAnime(){
        return Anime.builder()
                .name("Hajime No Ippo")
                .id(1L)
                .build();
    }
}
