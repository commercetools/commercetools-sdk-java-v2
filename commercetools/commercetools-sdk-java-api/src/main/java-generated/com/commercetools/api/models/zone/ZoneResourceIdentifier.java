package com.commercetools.api.models.zone;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.zone.ZoneResourceIdentifierImpl;

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
@JsonDeserialize(as = ZoneResourceIdentifierImpl.class)
public interface ZoneResourceIdentifier extends ResourceIdentifier {

    String ZONE = "zone";



    public static ZoneResourceIdentifier of(){
        return new ZoneResourceIdentifierImpl();
    }
    

    public static ZoneResourceIdentifier of(final ZoneResourceIdentifier template) {
        ZoneResourceIdentifierImpl instance = new ZoneResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ZoneResourceIdentifierBuilder builder(){
        return ZoneResourceIdentifierBuilder.of();
    }
    
    public static ZoneResourceIdentifierBuilder builder(final ZoneResourceIdentifier template){
        return ZoneResourceIdentifierBuilder.of(template);
    }
    

    default <T> T withZoneResourceIdentifier(Function<ZoneResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
