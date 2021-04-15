
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InvalidItemShippingDetailsErrorImpl.class)
public interface InvalidItemShippingDetailsError extends ErrorObject {

    String INVALID_ITEM_SHIPPING_DETAILS = "InvalidItemShippingDetails";

    @NotNull
    @JsonProperty("subject")
    public String getSubject();

    @NotNull
    @JsonProperty("itemId")
    public String getItemId();

    public void setSubject(final String subject);

    public void setItemId(final String itemId);

    public static InvalidItemShippingDetailsError of() {
        return new InvalidItemShippingDetailsErrorImpl();
    }

    public static InvalidItemShippingDetailsError of(final InvalidItemShippingDetailsError template) {
        InvalidItemShippingDetailsErrorImpl instance = new InvalidItemShippingDetailsErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setSubject(template.getSubject());
        instance.setItemId(template.getItemId());
        return instance;
    }

    public static InvalidItemShippingDetailsErrorBuilder builder() {
        return InvalidItemShippingDetailsErrorBuilder.of();
    }

    public static InvalidItemShippingDetailsErrorBuilder builder(final InvalidItemShippingDetailsError template) {
        return InvalidItemShippingDetailsErrorBuilder.of(template);
    }

    default <T> T withInvalidItemShippingDetailsError(Function<InvalidItemShippingDetailsError, T> helper) {
        return helper.apply(this);
    }
}
