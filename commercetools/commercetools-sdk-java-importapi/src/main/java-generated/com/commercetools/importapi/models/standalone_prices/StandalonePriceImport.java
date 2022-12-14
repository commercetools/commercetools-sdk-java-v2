
package com.commercetools.importapi.models.standalone_prices;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.DiscountedPrice;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.PriceTier;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data representation for a Standalone Price to be imported that is persisted as a Standalone Price in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceImport standalonePriceImport = StandalonePriceImport.builder()
 *             .key("{key}")
 *             .sku("{sku}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceImportImpl.class)
public interface StandalonePriceImport extends ImportResource {

    /**
     *  <p>User-defined unique identifier for the Standalone Price.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Identifies the ProductVariant to which this Standalone Price is associated. This value is not validated to exist in Product Variants.</p>
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Sets the money value of this Price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Sets the country for which this Price is valid.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();

    /**
     *  <p>Sets the date from which the Price is valid.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Sets the date until the Price is valid.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Sets price tiers.</p>
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with value.</p>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    public void setKey(final String key);

    public void setSku(final String sku);

    public void setValue(final TypedMoney value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    public void setChannel(final ChannelKeyReference channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    public void setTiers(final List<PriceTier> tiers);

    public void setDiscounted(final DiscountedPrice discounted);

    public void setCustom(final Custom custom);

    public static StandalonePriceImport of() {
        return new StandalonePriceImportImpl();
    }

    public static StandalonePriceImport of(final StandalonePriceImport template) {
        StandalonePriceImportImpl instance = new StandalonePriceImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setTiers(template.getTiers());
        instance.setDiscounted(template.getDiscounted());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StandalonePriceImportBuilder builder() {
        return StandalonePriceImportBuilder.of();
    }

    public static StandalonePriceImportBuilder builder(final StandalonePriceImport template) {
        return StandalonePriceImportBuilder.of(template);
    }

    default <T> T withStandalonePriceImport(Function<StandalonePriceImport, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceImport>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceImport>";
            }
        };
    }
}
