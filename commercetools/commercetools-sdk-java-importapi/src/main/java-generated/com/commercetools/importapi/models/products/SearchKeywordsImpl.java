package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.products.SearchKeyword;
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
 *  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of IETF language tag. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
 *  <pre><code>{
 *    "en": [
 *      { "text": "Multi tool" },
 *      { "text": "Swiss Army Knife", "suggestTokenizer": { "type": "whitespace" } }
 *    ],
 *    "de": [
 *      {
 *        "text": "Schweizer Messer",
 *        "suggestTokenizer": {
 *          "type": "custom",
 *          "inputs": ["schweizer messer", "offiziersmesser", "sackmesser"]
 *        }
 *      }
 *    ]
 *  }
 *  </code></pre>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SearchKeywordsImpl implements SearchKeywords, ModelBase {

    
    private Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SearchKeywordsImpl(@JsonProperty("values") final Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values) {
        this.values = values;
    }
    /**
     * create empty instance
     */
    public SearchKeywordsImpl() {
    }

    /**
     *
     */
    
    public Map<String,java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values() {
        return values;
    }

    
    public void setValue(String key, java.util.List<com.commercetools.importapi.models.products.SearchKeyword> value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SearchKeywordsImpl that = (SearchKeywordsImpl) o;
    
        return new EqualsBuilder()
                .append(values, that.values)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(values)
            .toHashCode();
    }

}
