
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Shape of the value for cart discounts gift line item value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueGiftLineItemChangeValue changeValueGiftLineItemChangeValue = ChangeValueGiftLineItemChangeValue.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantId(1)
 *             .distributionChannel(distributionChannelBuilder -> distributionChannelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeValueGiftLineItemChangeValueImpl.class)
public interface ChangeValueGiftLineItemChangeValue extends ChangeValueChangeValue {

    /**
     * discriminator value for ChangeValueGiftLineItemChangeValue
     */
    String GIFT_LINE_ITEM = "giftLineItem";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public Reference getProduct();

    /**
     *
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public Reference getSupplyChannel();

    /**
     *
     * @return distributionChannel
     */
    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public Reference getDistributionChannel();

    /**
     * set product
     * @param product value to be set
     */

    public void setProduct(final Reference product);

    /**
     * set variantId
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     * set supplyChannel
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final Reference supplyChannel);

    /**
     * set distributionChannel
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final Reference distributionChannel);

    /**
     * factory method
     * @return instance of ChangeValueGiftLineItemChangeValue
     */
    public static ChangeValueGiftLineItemChangeValue of() {
        return new ChangeValueGiftLineItemChangeValueImpl();
    }

    /**
     * factory method to copy an instance of ChangeValueGiftLineItemChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeValueGiftLineItemChangeValue of(final ChangeValueGiftLineItemChangeValue template) {
        ChangeValueGiftLineItemChangeValueImpl instance = new ChangeValueGiftLineItemChangeValueImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    /**
     * builder factory method for ChangeValueGiftLineItemChangeValue
     * @return builder
     */
    public static ChangeValueGiftLineItemChangeValueBuilder builder() {
        return ChangeValueGiftLineItemChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeValueGiftLineItemChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueGiftLineItemChangeValueBuilder builder(final ChangeValueGiftLineItemChangeValue template) {
        return ChangeValueGiftLineItemChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeValueGiftLineItemChangeValue(Function<ChangeValueGiftLineItemChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeValueGiftLineItemChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeValueGiftLineItemChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeValueGiftLineItemChangeValue>";
            }
        };
    }
}
