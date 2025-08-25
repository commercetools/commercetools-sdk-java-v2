
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.ProductSelectionSetting;
import com.commercetools.api.models.store_country.StoreCountry;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/stores:POST" rel="nofollow">Create Store</a> request.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("StoreCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCreatedMessagePayloadImpl.class)
public interface StoreCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreCreatedMessagePayload
     */
    String STORE_CREATED = "StoreCreated";

    /**
     *  <p>The <code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Languages of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created. Languages are represented as <span>IETF language tags</span>.</p>
     * @return languages
     */

    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @return countries
     */
    @Valid
    @JsonProperty("countries")
    public List<StoreCountry> getCountries();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Distribution Channels</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @return distributionChannels
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelReference> getDistributionChannels();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Supply Channels</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @return supplyChannels
     */
    @NotNull
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelReference> getSupplyChannels();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionSetting" rel="nofollow">ProductSelectionSettings</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @return productSelections
     */
    @NotNull
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSetting> getProductSelections();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>The <code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Languages of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created. Languages are represented as <span>IETF language tags</span>.</p>
     * @param languages values to be set
     */

    @JsonIgnore
    public void setLanguages(final String... languages);

    /**
     *  <p>Languages of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created. Languages are represented as <span>IETF language tags</span>.</p>
     * @param languages values to be set
     */

    public void setLanguages(final List<String> languages);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @param countries values to be set
     */

    @JsonIgnore
    public void setCountries(final StoreCountry... countries);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @param countries values to be set
     */

    public void setCountries(final List<StoreCountry> countries);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Distribution Channels</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @param distributionChannels values to be set
     */

    @JsonIgnore
    public void setDistributionChannels(final ChannelReference... distributionChannels);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Distribution Channels</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @param distributionChannels values to be set
     */

    public void setDistributionChannels(final List<ChannelReference> distributionChannels);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Supply Channels</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @param supplyChannels values to be set
     */

    @JsonIgnore
    public void setSupplyChannels(final ChannelReference... supplyChannels);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Supply Channels</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @param supplyChannels values to be set
     */

    public void setSupplyChannels(final List<ChannelReference> supplyChannels);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionSetting" rel="nofollow">ProductSelectionSettings</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @param productSelections values to be set
     */

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSetting... productSelections);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionSetting" rel="nofollow">ProductSelectionSettings</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
     * @param productSelections values to be set
     */

    public void setProductSelections(final List<ProductSelectionSetting> productSelections);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was created.</p>
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
     * factory method to create a shallow copy StoreCreatedMessagePayload
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

    public StoreCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreCreatedMessagePayload deepCopy(@Nullable final StoreCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreCreatedMessagePayloadImpl instance = new StoreCreatedMessagePayloadImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setLanguages(Optional.ofNullable(template.getLanguages()).map(ArrayList::new).orElse(null));
        instance.setCountries(Optional.ofNullable(template.getCountries())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store_country.StoreCountry::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDistributionChannels(Optional.ofNullable(template.getDistributionChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setSupplyChannels(Optional.ofNullable(template.getSupplyChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setProductSelections(Optional.ofNullable(template.getProductSelections())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.ProductSelectionSetting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
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
