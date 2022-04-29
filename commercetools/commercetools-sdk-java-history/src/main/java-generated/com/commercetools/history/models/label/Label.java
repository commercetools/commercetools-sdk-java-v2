
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Provides descriptive information specific to the resource.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.CustomObjectLabelImpl.class, name = CustomObjectLabel.CUSTOM_OBJECT_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.CustomerLabelImpl.class, name = CustomerLabel.CUSTOMER_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.LocalizedLabelImpl.class, name = LocalizedLabel.LOCALIZED_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.OrderLabelImpl.class, name = OrderLabel.ORDER_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.PaymentLabelImpl.class, name = PaymentLabel.PAYMENT_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.ProductLabelImpl.class, name = ProductLabel.PRODUCT_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.ReviewLabelImpl.class, name = ReviewLabel.REVIEW_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.label.StringLabelImpl.class, name = StringLabel.STRING_LABEL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = LabelImpl.class, visible = true)
@JsonDeserialize(as = LabelImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Label {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.history.models.label.CustomObjectLabelBuilder customObjectLabelBuilder() {
        return com.commercetools.history.models.label.CustomObjectLabelBuilder.of();
    }

    public static com.commercetools.history.models.label.CustomerLabelBuilder customerLabelBuilder() {
        return com.commercetools.history.models.label.CustomerLabelBuilder.of();
    }

    public static com.commercetools.history.models.label.LocalizedLabelBuilder localizedLabelBuilder() {
        return com.commercetools.history.models.label.LocalizedLabelBuilder.of();
    }

    public static com.commercetools.history.models.label.OrderLabelBuilder orderLabelBuilder() {
        return com.commercetools.history.models.label.OrderLabelBuilder.of();
    }

    public static com.commercetools.history.models.label.PaymentLabelBuilder paymentLabelBuilder() {
        return com.commercetools.history.models.label.PaymentLabelBuilder.of();
    }

    public static com.commercetools.history.models.label.ProductLabelBuilder productLabelBuilder() {
        return com.commercetools.history.models.label.ProductLabelBuilder.of();
    }

    public static com.commercetools.history.models.label.ReviewLabelBuilder reviewLabelBuilder() {
        return com.commercetools.history.models.label.ReviewLabelBuilder.of();
    }

    public static com.commercetools.history.models.label.StringLabelBuilder stringLabelBuilder() {
        return com.commercetools.history.models.label.StringLabelBuilder.of();
    }

    default <T> T withLabel(Function<Label, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Label> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Label>() {
            @Override
            public String toString() {
                return "TypeReference<Label>";
            }
        };
    }
}
