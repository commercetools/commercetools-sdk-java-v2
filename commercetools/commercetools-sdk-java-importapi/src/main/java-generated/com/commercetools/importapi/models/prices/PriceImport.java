
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
*  <p>The data representation for a Price to be imported that is persisted as a <a href="/../api/projects/products#price">Price</a> in the Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceImportImpl.class)
public interface PriceImport extends ImportResource {

    /**
    *  <p>Maps to <code>Price.value</code>.</p>
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
    *  <p>The Reference to the <a href="/../api/projects/customerGroups#customergroup">CustomerGroup</a> with which the Price is associated.
    *  If referenced CustomerGroup does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
    *  <p>The Reference to the <a href="/../api/projects/channels#channel">Channel</a> with which the Price is associated.
    *  If referenced Channel does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary Channel is created.</p>
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
    *  <p>The ProductVariant in which this Price is contained.
    *  The Reference to the <a href="/../api/projects/products#productvariant">ProductVariant</a> with which the Price is associated.
    *  If referenced ProductVariant does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productVariant")
    public ProductVariantKeyReference getProductVariant();

    /**
    *  <p>The Product in which the Product Variant containing this Price is contained. Maps to <code>ProductVariant.product</code>.
    *  The Reference to the <a href="/../api/projects/products#product">Product</a> with which the Price is associated.
    *  If referenced Product does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary Product is created.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<PriceImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceImport>() {
            @Override
            public String toString() {
                return "TypeReference<PriceImport>";
            }
        };
    }
}
