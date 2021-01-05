package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.LanguageUsedInStoresErrorImpl;

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
@JsonDeserialize(as = LanguageUsedInStoresErrorImpl.class)
public interface LanguageUsedInStoresError extends ErrorObject {



    public static LanguageUsedInStoresError of(){
        return new LanguageUsedInStoresErrorImpl();
    }
    

    public static LanguageUsedInStoresError of(final LanguageUsedInStoresError template) {
        LanguageUsedInStoresErrorImpl instance = new LanguageUsedInStoresErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static LanguageUsedInStoresErrorBuilder builder(){
        return LanguageUsedInStoresErrorBuilder.of();
    }
    
    public static LanguageUsedInStoresErrorBuilder builder(final LanguageUsedInStoresError template){
        return LanguageUsedInStoresErrorBuilder.of(template);
    }
    

    default <T> T withLanguageUsedInStoresError(Function<LanguageUsedInStoresError, T> helper) {
        return helper.apply(this);
    }
}
