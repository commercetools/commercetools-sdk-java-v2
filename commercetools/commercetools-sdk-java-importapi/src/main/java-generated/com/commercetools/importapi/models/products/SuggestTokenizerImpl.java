
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>The tokenizer defines the tokens that are used to match against the <a href="/../products-suggestions#suggest-query">Suggest Query</a> input.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SuggestTokenizerImpl implements SuggestTokenizer, ModelBase {

    private String type;

    @JsonCreator
    SuggestTokenizerImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }

    public SuggestTokenizerImpl() {
    }

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SuggestTokenizerImpl that = (SuggestTokenizerImpl) o;

        return new EqualsBuilder().append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

}
