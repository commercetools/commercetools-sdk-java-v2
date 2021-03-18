
package com.commercetools.history.models;

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
        @JsonSubTypes.Type(value = com.commercetools.history.models.CustomerLabelImpl.class, name = CustomerLabel.CUSTOMER_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.LocalizedLabelImpl.class, name = LocalizedLabel.LOCALIZED_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.OrderLabelImpl.class, name = OrderLabel.ORDER_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.PaymentLabelImpl.class, name = PaymentLabel.PAYMENT_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.ProductLabelImpl.class, name = ProductLabel.PRODUCT_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.ReviewLabelImpl.class, name = ReviewLabel.REVIEW_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.StringLabelImpl.class, name = StringLabel.STRING_LABEL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = LabelImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Label {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withLabel(Function<Label, T> helper) {
        return helper.apply(this);
    }
}
