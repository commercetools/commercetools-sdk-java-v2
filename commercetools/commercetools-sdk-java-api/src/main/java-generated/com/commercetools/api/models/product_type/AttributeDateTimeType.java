package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeDateTimeTypeImpl;

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
@JsonDeserialize(as = AttributeDateTimeTypeImpl.class)
public interface AttributeDateTimeType extends AttributeType {



    public static AttributeDateTimeTypeImpl of(){
        return new AttributeDateTimeTypeImpl();
    }
    

    public static AttributeDateTimeTypeImpl of(final AttributeDateTimeType template) {
        AttributeDateTimeTypeImpl instance = new AttributeDateTimeTypeImpl();
        return instance;
    }

    default <T> T withAttributeDateTimeType(Function<AttributeDateTimeType, T> helper) {
        return helper.apply(this);
    }
}
