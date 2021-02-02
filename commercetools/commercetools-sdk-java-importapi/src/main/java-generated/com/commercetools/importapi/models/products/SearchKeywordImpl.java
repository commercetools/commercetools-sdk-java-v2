
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchKeywordImpl implements SearchKeyword {

    private String text;

    private com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer;

    @JsonCreator
    SearchKeywordImpl(@JsonProperty("text") final String text,
            @JsonProperty("suggestTokenizer") final com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer) {
        this.text = text;
        this.suggestTokenizer = suggestTokenizer;
    }

    public SearchKeywordImpl() {
    }

    public String getText() {
        return this.text;
    }

    public com.commercetools.importapi.models.products.SuggestTokenizer getSuggestTokenizer() {
        return this.suggestTokenizer;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setSuggestTokenizer(
            final com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchKeywordImpl that = (SearchKeywordImpl) o;

        return new EqualsBuilder().append(text, that.text).append(suggestTokenizer, that.suggestTokenizer).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(text).append(suggestTokenizer).toHashCode();
    }

}
