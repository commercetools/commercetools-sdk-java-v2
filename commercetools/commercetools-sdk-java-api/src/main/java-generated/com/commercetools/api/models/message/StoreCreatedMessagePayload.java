
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.ProductSelectionSetting;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCreatedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCreatedMessagePayload storeCreatedMessagePayload = StoreCreatedMessagePayload.builder()
 *             .plusLanguages(languagesBuilder -> languagesBuilder)
 *             .plusDistributionChannels(distributionChannelsBuilder -> distributionChannelsBuilder)
 *             .plusSupplyChannels(supplyChannelsBuilder -> supplyChannelsBuilder)
 *             .plusProductSelections(productSelectionsBuilder -> productSelectionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCreatedMessagePayloadImpl.class)
public interface StoreCreatedMessagePayload extends MessagePayload {

    String STORE_CREATED = "StoreCreated";

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *
     */
    @NotNull
    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelReference> getDistributionChannels();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelReference> getSupplyChannels();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSetting> getProductSelections();

    /**
     *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a Type.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setName(final LocalizedString name);

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    @JsonIgnore
    public void setDistributionChannels(final ChannelReference... distributionChannels);

    public void setDistributionChannels(final List<ChannelReference> distributionChannels);

    @JsonIgnore
    public void setSupplyChannels(final ChannelReference... supplyChannels);

    public void setSupplyChannels(final List<ChannelReference> supplyChannels);

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSetting... productSelections);

    public void setProductSelections(final List<ProductSelectionSetting> productSelections);

    public void setCustom(final CustomFields custom);

    public static StoreCreatedMessagePayload of() {
        return new StoreCreatedMessagePayloadImpl();
    }

    public static StoreCreatedMessagePayload of(final StoreCreatedMessagePayload template) {
        StoreCreatedMessagePayloadImpl instance = new StoreCreatedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        instance.setProductSelections(template.getProductSelections());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StoreCreatedMessagePayloadBuilder builder() {
        return StoreCreatedMessagePayloadBuilder.of();
    }

    public static StoreCreatedMessagePayloadBuilder builder(final StoreCreatedMessagePayload template) {
        return StoreCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreCreatedMessagePayload(Function<StoreCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCreatedMessagePayload>";
            }
        };
    }
}
