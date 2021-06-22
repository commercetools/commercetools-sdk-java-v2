
package com.commercetools.importapi.models.prices;

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
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Imports a product variant's prices.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceImportImpl.class)
public interface PriceImport extends ImportResource {

    /**
    *  <p>Maps to <code>Price.value</code>.</p>
    *  <p>The Import API <strong>only</strong> supports <code>centPrecision</code> prices.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
    *  <p>Maps to <code>Price.county</code>.</p>
    */

    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>Maps to <code>Price.validFrom</code>.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>Maps to <code>Price.validUntil</code>.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
    *  <p>References a customer group by its key.</p>
    *  <p>The customer group referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
    *  <p>References a channel by its key.</p>
    *  <p>The channel referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();

    /**
    *  <p>Sets a discounted price from an external service.</p>
    */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
    *  <p>Only the Price updates will be published to <code>staged</code> and <code>current</code> projection.</p>
    */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
    *  <p>The tiered prices for this price.</p>
    */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
    *  <p>The custom fields for this price.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
    *  <p>The product variant in which this price is contained.</p>
    *  <p>The product variant referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productVariant")
    public ProductVariantKeyReference getProductVariant();

    /**
    *  <p>The product in which this product variant containong the price is contained. Maps to <code>ProductVariant.product</code>.</p>
    *  <p>The product referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    public void setValue(final TypedMoney value);

    public void setCountry(final String country);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    public void setChannel(final ChannelKeyReference channel);

    public void setDiscounted(final DiscountedPrice discounted);

    public void setPublish(final Boolean publish);

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    public void setTiers(final List<PriceTier> tiers);

    public void setCustom(final Custom custom);

    public void setProductVariant(final ProductVariantKeyReference productVariant);

    public void setProduct(final ProductKeyReference product);

    public static PriceImport of() {
        return new PriceImportImpl();
    }

    public static PriceImport of(final PriceImport template) {
        PriceImportImpl instance = new PriceImportImpl();
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setDiscounted(template.getDiscounted());
        instance.setPublish(template.getPublish());
        instance.setTiers(template.getTiers());
        instance.setCustom(template.getCustom());
        instance.setProductVariant(template.getProductVariant());
        instance.setProduct(template.getProduct());
        return instance;
    }

    public static PriceImportBuilder builder() {
        return PriceImportBuilder.of();
    }

    public static PriceImportBuilder builder(final PriceImport template) {
        return PriceImportBuilder.of(template);
    }

    default <T> T withPriceImport(Function<PriceImport, T> helper) {
        return helper.apply(this);
    }
}
