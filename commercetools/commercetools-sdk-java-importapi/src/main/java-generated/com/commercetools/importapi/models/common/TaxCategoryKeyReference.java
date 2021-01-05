package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>References a tax category by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryKeyReferenceImpl.class)
public interface TaxCategoryKeyReference extends KeyReference {



    public static TaxCategoryKeyReference of(){
        return new TaxCategoryKeyReferenceImpl();
    }
    

    public static TaxCategoryKeyReference of(final TaxCategoryKeyReference template) {
        TaxCategoryKeyReferenceImpl instance = new TaxCategoryKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static TaxCategoryKeyReferenceBuilder builder(){
        return TaxCategoryKeyReferenceBuilder.of();
    }
    
    public static TaxCategoryKeyReferenceBuilder builder(final TaxCategoryKeyReference template){
        return TaxCategoryKeyReferenceBuilder.of(template);
    }
    

    default <T> T withTaxCategoryKeyReference(Function<TaxCategoryKeyReference, T> helper) {
        return helper.apply(this);
    }
}
