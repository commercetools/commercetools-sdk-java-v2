package com.commercetools.api.models.product;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SuggestionImpl implements Suggestion {

    private String text;

    @JsonCreator
    SuggestionImpl(@JsonProperty("text") final String text) {
        this.text = text;
    }
    public SuggestionImpl() {
       
    }

    /**
    *  <p>The suggested text.</p>
    */
    public String getText(){
        return this.text;
    }

    public void setText(final String text){
        this.text = text;
    }

}
