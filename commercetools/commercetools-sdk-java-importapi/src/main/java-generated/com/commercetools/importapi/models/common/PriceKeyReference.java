package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.PriceKeyReferenceImpl;

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
*  <p>References a price by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PriceKeyReferenceImpl.class)
public interface PriceKeyReference extends KeyReference {



    public static PriceKeyReferenceImpl of(){
        return new PriceKeyReferenceImpl();
    }
    

    public static PriceKeyReferenceImpl of(final PriceKeyReference template) {
        PriceKeyReferenceImpl instance = new PriceKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T extends Accessor<PriceKeyReference>> T withPriceKeyReference(Function<PriceKeyReference, T> helper) {
        return helper.apply(this);
    }
}
