package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ChannelKeyReferenceImpl;

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
*  <p>References a channel by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ChannelKeyReferenceImpl.class)
public interface ChannelKeyReference extends KeyReference {



    public static ChannelKeyReferenceImpl of(){
        return new ChannelKeyReferenceImpl();
    }
    

    public static ChannelKeyReferenceImpl of(final ChannelKeyReference template) {
        ChannelKeyReferenceImpl instance = new ChannelKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withChannelKeyReference(Function<ChannelKeyReference, T> helper) {
        return helper.apply(this);
    }
}
