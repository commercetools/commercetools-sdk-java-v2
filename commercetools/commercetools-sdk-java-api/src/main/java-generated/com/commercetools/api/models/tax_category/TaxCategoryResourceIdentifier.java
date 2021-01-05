package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryResourceIdentifierImpl.class)
public interface TaxCategoryResourceIdentifier extends ResourceIdentifier {



    public static TaxCategoryResourceIdentifier of(){
        return new TaxCategoryResourceIdentifierImpl();
    }
    

    public static TaxCategoryResourceIdentifier of(final TaxCategoryResourceIdentifier template) {
        TaxCategoryResourceIdentifierImpl instance = new TaxCategoryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static TaxCategoryResourceIdentifierBuilder builder(){
        return TaxCategoryResourceIdentifierBuilder.of();
    }
    
    public static TaxCategoryResourceIdentifierBuilder builder(final TaxCategoryResourceIdentifier template){
        return TaxCategoryResourceIdentifierBuilder.of(template);
    }
    

    default <T> T withTaxCategoryResourceIdentifier(Function<TaxCategoryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
