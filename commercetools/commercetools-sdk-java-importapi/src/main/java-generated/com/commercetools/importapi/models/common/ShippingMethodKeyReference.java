package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl;

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

/**
*  <p>References a shipping method by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodKeyReferenceImpl.class)
public interface ShippingMethodKeyReference extends KeyReference {



    public static ShippingMethodKeyReferenceImpl of(){
        return new ShippingMethodKeyReferenceImpl();
    }
    

    public static ShippingMethodKeyReferenceImpl of(final ShippingMethodKeyReference template) {
        ShippingMethodKeyReferenceImpl instance = new ShippingMethodKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withShippingMethodKeyReference(Function<ShippingMethodKeyReference, T> helper) {
        return helper.apply(this);
    }
}
