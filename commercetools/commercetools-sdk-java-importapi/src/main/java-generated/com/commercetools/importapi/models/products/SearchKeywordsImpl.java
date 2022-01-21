
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
*  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
*  <pre><code class="language-json">{
*    &quot;en&quot;: [
*      { &quot;text&quot;: &quot;Multi tool&quot; },
*      { &quot;text&quot;: &quot;Swiss Army Knife&quot;, &quot;suggestTokenizer&quot;: { &quot;type&quot;: &quot;whitespace&quot; } }
*    ],
*    &quot;de&quot;: [
*      {
*        &quot;text&quot;: &quot;Schweizer Messer&quot;,
*        &quot;suggestTokenizer&quot;: {
*          &quot;type&quot;: &quot;custom&quot;,
*          &quot;inputs&quot;: [&quot;schweizer messer&quot;, &quot;offiziersmesser&quot;, &quot;sackmesser&quot;]
*        }
*      }
*    ]
*  }
*  </code></pre>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SearchKeywordsImpl implements SearchKeywords, ModelBase {

    private Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values;

    @JsonCreator
    SearchKeywordsImpl(
            @JsonProperty("values") final Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values) {
        this.values = values;
    }

    public SearchKeywordsImpl() {
    }

    public Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values() {
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
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SearchKeywordsImpl that = (SearchKeywordsImpl) o;

        return new EqualsBuilder().append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

}
