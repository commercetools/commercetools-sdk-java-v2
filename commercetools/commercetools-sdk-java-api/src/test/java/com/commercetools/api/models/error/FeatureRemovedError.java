package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.FeatureRemovedErrorImpl;

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
@JsonDeserialize(as = FeatureRemovedErrorImpl.class)
public interface FeatureRemovedError extends ErrorObject {

    String FEATURE_REMOVED = "FeatureRemoved";



    public static FeatureRemovedError of(){
        return new FeatureRemovedErrorImpl();
    }
    

    public static FeatureRemovedError of(final FeatureRemovedError template) {
        FeatureRemovedErrorImpl instance = new FeatureRemovedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static FeatureRemovedErrorBuilder builder(){
        return FeatureRemovedErrorBuilder.of();
    }
    
    public static FeatureRemovedErrorBuilder builder(final FeatureRemovedError template){
        return FeatureRemovedErrorBuilder.of(template);
    }
    

    default <T> T withFeatureRemovedError(Function<FeatureRemovedError, T> helper) {
        return helper.apply(this);
    }
}
