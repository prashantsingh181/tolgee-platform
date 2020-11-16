package io.polygloat.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SetTranslationsDTO {
    /**
     * Source full path is stored as name in entity
     */
    @NotNull
    @NotBlank
    private String key;

    /**
     * Map of language abbreviation -> text
     */
    private Map<String, String> translations;


    public String getKey() {
        return key;
    }

    public Map<String, String> getTranslations() {
        return translations;
    }
}
