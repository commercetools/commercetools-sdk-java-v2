package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = NoMatchingProductDiscountFoundErrorImpl.class)
public interface NoMatchingProductDiscountFoundError extends ErrorObject {



    public static NoMatchingProductDiscountFoundErrorImpl of(){
        return new NoMatchingProductDiscountFoundErrorImpl();
    }
    

    public static NoMatchingProductDiscountFoundErrorImpl of(final NoMatchingProductDiscountFoundError template) {
        NoMatchingProductDiscountFoundErrorImpl instance = new NoMatchingProductDiscountFoundErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    default <T extends Accessor<NoMatchingProductDiscountFoundError>> T withNoMatchingProductDiscountFoundError(Function<NoMatchingProductDiscountFoundError, T> helper) {
        return helper.apply(this);
    }
}
