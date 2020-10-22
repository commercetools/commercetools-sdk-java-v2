package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeDateTypeImpl;

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
@JsonDeserialize(as = AttributeDateTypeImpl.class)
public interface AttributeDateType extends AttributeType {



    public static AttributeDateTypeImpl of(){
        return new AttributeDateTypeImpl();
    }
    

    public static AttributeDateTypeImpl of(final AttributeDateType template) {
        AttributeDateTypeImpl instance = new AttributeDateTypeImpl();
        return instance;
    }

    default <T extends Accessor<AttributeDateType>> T withAttributeDateType(Function<AttributeDateType, T> helper) {
        return helper.apply(this);
    }
}
