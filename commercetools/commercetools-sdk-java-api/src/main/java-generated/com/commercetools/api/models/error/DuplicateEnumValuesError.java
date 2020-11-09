package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.DuplicateEnumValuesErrorImpl;

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
@JsonDeserialize(as = DuplicateEnumValuesErrorImpl.class)
public interface DuplicateEnumValuesError extends ErrorObject {

    
    @NotNull
    @JsonProperty("duplicates")
    public List<String> getDuplicates();

    @JsonIgnore
    public void setDuplicates(final String ...duplicates);
    public void setDuplicates(final List<String> duplicates);

    public static DuplicateEnumValuesErrorImpl of(){
        return new DuplicateEnumValuesErrorImpl();
    }
    

    public static DuplicateEnumValuesErrorImpl of(final DuplicateEnumValuesError template) {
        DuplicateEnumValuesErrorImpl instance = new DuplicateEnumValuesErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setDuplicates(template.getDuplicates());
        return instance;
    }

    default <T> T withDuplicateEnumValuesError(Function<DuplicateEnumValuesError, T> helper) {
        return helper.apply(this);
    }
}
