package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeLocalizableTextTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeLocalizableTextTypeImpl.class)
public interface AttributeLocalizableTextType extends AttributeType {



    public static AttributeLocalizableTextTypeImpl of(){
        return new AttributeLocalizableTextTypeImpl();
    }
    

    public static AttributeLocalizableTextTypeImpl of(final AttributeLocalizableTextType template) {
        AttributeLocalizableTextTypeImpl instance = new AttributeLocalizableTextTypeImpl();
        return instance;
    }

}
