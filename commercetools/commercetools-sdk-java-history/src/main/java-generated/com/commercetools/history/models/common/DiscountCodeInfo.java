
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeInfoImpl.class)
public interface DiscountCodeInfo {

    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public Reference getDiscountCode();

    @NotNull
    @JsonProperty("state")
    public DiscountCodeState getState();

    public void setDiscountCode(final Reference discountCode);

    public void setState(final DiscountCodeState state);

    public static DiscountCodeInfo of() {
        return new DiscountCodeInfoImpl();
    }

    public static DiscountCodeInfo of(final DiscountCodeInfo template) {
        DiscountCodeInfoImpl instance = new DiscountCodeInfoImpl();
        instance.setDiscountCode(template.getDiscountCode());
        instance.setState(template.getState());
        return instance;
    }

    public static DiscountCodeInfoBuilder builder() {
        return DiscountCodeInfoBuilder.of();
    }

    public static DiscountCodeInfoBuilder builder(final DiscountCodeInfo template) {
        return DiscountCodeInfoBuilder.of(template);
    }

    default <T> T withDiscountCodeInfo(Function<DiscountCodeInfo, T> helper) {
        return helper.apply(this);
    }
}
