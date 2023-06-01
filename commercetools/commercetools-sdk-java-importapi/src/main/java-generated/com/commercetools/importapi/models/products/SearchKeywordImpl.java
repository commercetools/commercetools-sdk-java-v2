package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.products.SuggestTokenizer;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * SearchKeyword
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SearchKeywordImpl implements SearchKeyword, ModelBase {

    
    private String text;
    
    
    private com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchKeywordImpl(@JsonProperty("text") final String text, @JsonProperty("suggestTokenizer") final com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer) {
        this.text = text;
        this.suggestTokenizer = suggestTokenizer;
    }
    /**
     * create empty instance
     */
    public SearchKeywordImpl() {
    }

    /**
     *
     */
    
    public String getText(){
        return this.text;
    }
    
    /**
     *  <p>The tokenizer defines the tokens that are used to match against the Suggest Query input.</p>
     */
    
    public com.commercetools.importapi.models.products.SuggestTokenizer getSuggestTokenizer(){
        return this.suggestTokenizer;
    }

    
    public void setText(final String text){
        this.text = text;
    }
    
    
    public void setSuggestTokenizer(final com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer){
        this.suggestTokenizer = suggestTokenizer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SearchKeywordImpl that = (SearchKeywordImpl) o;
    
        return new EqualsBuilder()
                .append(text, that.text)
                .append(suggestTokenizer, that.suggestTokenizer)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(text)
            .append(suggestTokenizer)
            .toHashCode();
    }

}
