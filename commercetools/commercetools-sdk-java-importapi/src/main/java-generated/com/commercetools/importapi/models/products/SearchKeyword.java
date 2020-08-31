package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.products.SuggestTokenizer;
import com.commercetools.importapi.models.products.SearchKeywordImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SearchKeywordImpl.class)
public interface SearchKeyword  {

    
    @NotNull
    @JsonProperty("text")
    public String getText();
    
    @Valid
    @JsonProperty("suggestTokenizer")
    public SuggestTokenizer getSuggestTokenizer();

    public void setText(final String text);
    
    public void setSuggestTokenizer(final SuggestTokenizer suggestTokenizer);

    public static SearchKeywordImpl of(){
        return new SearchKeywordImpl();
    }
    

    public static SearchKeywordImpl of(final SearchKeyword template) {
        SearchKeywordImpl instance = new SearchKeywordImpl();
        instance.setText(template.getText());
        instance.setSuggestTokenizer(template.getSuggestTokenizer());
        return instance;
    }

}
