
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDraft storeDraft = StoreDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreDraftImpl.class)
public interface StoreDraft extends com.commercetools.api.models.CustomizableDraft<StoreDraft> {

    /**
     *  <p>User-defined unique and immutable identifier for the Store. Keys can only contain alphanumeric characters, underscores, and hyphens.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the Store.</p>
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Languages defined in Project. Only languages defined in the Project can be used.</p>
     */

    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *  <p>ResourceIdentifier to a Channel with <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelResourceIdentifier> getDistributionChannels();

    /**
     *  <p>ResourceIdentifier to a Channel with <code>InventorySupply</code> ChannelRoleEnum.</p>
     */
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelResourceIdentifier> getSupplyChannels();

    /**
     *  <p>Controls availability of Products for this Store via active Product Selections.</p>
     *  <ul>
     *   <li>Leave empty if all Products in the Project should be available in this Store.</li>
     *   <li>If provided, Products from <code>active</code> Product Selections are available in this Store.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSettingDraft> getProductSelections();

    /**
     *  <p>Custom fields for the Store.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setName(final LocalizedString name);

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    @JsonIgnore
    public void setDistributionChannels(final ChannelResourceIdentifier... distributionChannels);

    public void setDistributionChannels(final List<ChannelResourceIdentifier> distributionChannels);

    @JsonIgnore
    public void setSupplyChannels(final ChannelResourceIdentifier... supplyChannels);

    public void setSupplyChannels(final List<ChannelResourceIdentifier> supplyChannels);

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSettingDraft... productSelections);

    public void setProductSelections(final List<ProductSelectionSettingDraft> productSelections);

    public void setCustom(final CustomFieldsDraft custom);

    public static StoreDraft of() {
        return new StoreDraftImpl();
    }

    public static StoreDraft of(final StoreDraft template) {
        StoreDraftImpl instance = new StoreDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        instance.setProductSelections(template.getProductSelections());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StoreDraftBuilder builder() {
        return StoreDraftBuilder.of();
    }

    public static StoreDraftBuilder builder(final StoreDraft template) {
        return StoreDraftBuilder.of(template);
    }

    default <T> T withStoreDraft(Function<StoreDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDraft>";
            }
        };
    }
}
