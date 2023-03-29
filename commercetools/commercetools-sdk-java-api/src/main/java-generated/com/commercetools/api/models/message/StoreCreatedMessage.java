
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
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
 *     StoreCreatedMessage storeCreatedMessage = StoreCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusDistributionChannels(distributionChannelsBuilder -> distributionChannelsBuilder)
 *             .plusSupplyChannels(supplyChannelsBuilder -> supplyChannelsBuilder)
 *             .plusProductSelections(productSelectionsBuilder -> productSelectionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCreatedMessageImpl.class)
public interface StoreCreatedMessage extends Message {

    /**
     * discriminator value for StoreCreatedMessage
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
     * @return instance of StoreCreatedMessage
     */
    public static StoreCreatedMessage of() {
        return new StoreCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreCreatedMessage of(final StoreCreatedMessage template) {
        StoreCreatedMessageImpl instance = new StoreCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
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
     * factory method to create a deep copy of StoreCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreCreatedMessage deepCopy(@Nullable final StoreCreatedMessage template) {
        if (template == null) {
            return null;
        }
        StoreCreatedMessageImpl instance = new StoreCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
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
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreCreatedMessage
     * @return builder
     */
    public static StoreCreatedMessageBuilder builder() {
        return StoreCreatedMessageBuilder.of();
    }

    /**
     * create builder for StoreCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCreatedMessageBuilder builder(final StoreCreatedMessage template) {
        return StoreCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreCreatedMessage(Function<StoreCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCreatedMessage>";
            }
        };
    }
}
