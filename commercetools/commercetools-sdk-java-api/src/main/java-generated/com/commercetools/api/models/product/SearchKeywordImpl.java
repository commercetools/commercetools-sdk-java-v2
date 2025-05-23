
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * SearchKeyword
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchKeywordImpl implements SearchKeyword, ModelBase {

    private String text;

    private com.commercetools.api.models.product.SuggestTokenizer suggestTokenizer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchKeywordImpl(@JsonProperty("text") final String text,
            @JsonProperty("suggestTokenizer") final com.commercetools.api.models.product.SuggestTokenizer suggestTokenizer) {
        this.text = text;
        this.suggestTokenizer = suggestTokenizer;
    }

    /**
     * create empty instance
     */
    public SearchKeywordImpl() {
    }

    /**
     *  <p>Text to return in the SuggestionResult.</p>
     */

    public String getText() {
        return this.text;
    }

    /**
     *  <p>If no tokenizer is defined, the <code>text</code> is used as a single token.</p>
     */

    public com.commercetools.api.models.product.SuggestTokenizer getSuggestTokenizer() {
        return this.suggestTokenizer;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setSuggestTokenizer(final com.commercetools.api.models.product.SuggestTokenizer suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchKeywordImpl that = (SearchKeywordImpl) o;

        return new EqualsBuilder().append(text, that.text)
                .append(suggestTokenizer, that.suggestTokenizer)
                .append(text, that.text)
                .append(suggestTokenizer, that.suggestTokenizer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(text).append(suggestTokenizer).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("text", text)
                .append("suggestTokenizer", suggestTokenizer)
                .build();
    }

    @Override
    public SearchKeyword copyDeep() {
        return SearchKeyword.deepCopy(this);
    }
}
