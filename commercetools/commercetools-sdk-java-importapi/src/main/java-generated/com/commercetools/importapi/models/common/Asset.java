
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AssetImpl.class)
public interface Asset {

    /**
    *  <p>User-defined identifier for the asset.
    *  Asset keys are unique inside their container (a product variant or a category).</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @JsonProperty("tags")
    public List<String> getTags();

    /**
    *  <p>The representation to be sent to the server when creating a resource with custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    public void setKey(final String key);

    @JsonIgnore
    public void setSources(final AssetSource... sources);

    public void setSources(final List<AssetSource> sources);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setTags(final String... tags);

    public void setTags(final List<String> tags);

    public void setCustom(final Custom custom);

    public static Asset of() {
        return new AssetImpl();
    }

    public static Asset of(final Asset template) {
        AssetImpl instance = new AssetImpl();
        instance.setKey(template.getKey());
        instance.setSources(template.getSources());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setTags(template.getTags());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static AssetBuilder builder() {
        return AssetBuilder.of();
    }

    public static AssetBuilder builder(final Asset template) {
        return AssetBuilder.of(template);
    }

    default <T> T withAsset(Function<Asset, T> helper) {
        return helper.apply(this);
    }
}
