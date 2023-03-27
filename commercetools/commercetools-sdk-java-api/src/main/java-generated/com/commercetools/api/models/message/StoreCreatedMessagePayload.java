
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.ProductSelectionSetting;
import com.commercetools.api.models.store_country.StoreCountry;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Store request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCreatedMessagePayload storeCreatedMessagePayload = StoreCreatedMessagePayload.builder()
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

    /**
     * discriminator value for StoreCreatedMessagePayload
     */
    String STORE_CREATED = "StoreCreated";

    /**
     *  <p>The <code>name</code> of the Store that was created.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @return languages
     */

    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *  <p>Countries of the Store that was created.</p>
     * @return countries
     */
    @Valid
    @JsonProperty("countries")
    public List<StoreCountry> getCountries();

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @return distributionChannels
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelReference> getDistributionChannels();

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @return supplyChannels
     */
    @NotNull
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelReference> getSupplyChannels();

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @return productSelections
     */
    @NotNull
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSetting> getProductSelections();

    /**
     *  <p>Custom Fields on the Store that was created.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>The <code>name</code> of the Store that was created.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @param languages values to be set
     */

    @JsonIgnore
    public void setLanguages(final String... languages);

    /**
     *  <p>Languages of the Store that was created. Languages are represented as IETF language tags.</p>
     * @param languages values to be set
     */

    public void setLanguages(final List<String> languages);

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param countries values to be set
     */

    @JsonIgnore
    public void setCountries(final StoreCountry... countries);

    /**
     *  <p>Countries of the Store that was created.</p>
     * @param countries values to be set
     */

    public void setCountries(final List<StoreCountry> countries);

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param distributionChannels values to be set
     */

    @JsonIgnore
    public void setDistributionChannels(final ChannelReference... distributionChannels);

    /**
     *  <p>Distribution Channels of the Store that was created.</p>
     * @param distributionChannels values to be set
     */

    public void setDistributionChannels(final List<ChannelReference> distributionChannels);

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param supplyChannels values to be set
     */

    @JsonIgnore
    public void setSupplyChannels(final ChannelReference... supplyChannels);

    /**
     *  <p>Supply Channels of the Store that was created.</p>
     * @param supplyChannels values to be set
     */

    public void setSupplyChannels(final List<ChannelReference> supplyChannels);

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param productSelections values to be set
     */

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSetting... productSelections);

    /**
     *  <p>ProductSelectionSettings of the Store that was created.</p>
     * @param productSelections values to be set
     */

    public void setProductSelections(final List<ProductSelectionSetting> productSelections);

    /**
     *  <p>Custom Fields on the Store that was created.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of StoreCreatedMessagePayload
     */
    public static StoreCreatedMessagePayload of() {
        return new StoreCreatedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of StoreCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreCreatedMessagePayload of(final StoreCreatedMessagePayload template) {
        StoreCreatedMessagePayloadImpl instance = new StoreCreatedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setCountries(template.getCountries());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        instance.setProductSelections(template.getProductSelections());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * builder factory method for StoreCreatedMessagePayload
     * @return builder
     */
    public static StoreCreatedMessagePayloadBuilder builder() {
        return StoreCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCreatedMessagePayloadBuilder builder(final StoreCreatedMessagePayload template) {
        return StoreCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreCreatedMessagePayload(Function<StoreCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCreatedMessagePayload>";
            }
        };
    }
}
