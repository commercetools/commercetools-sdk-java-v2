package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import java.time.LocalDate;
import com.commercetools.api.models.me.MyCustomerSetDateOfBirthActionImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerSetDateOfBirthActionImpl.class)
public interface MyCustomerSetDateOfBirthAction extends MyCustomerUpdateAction {

    
    
    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public static MyCustomerSetDateOfBirthActionImpl of(){
        return new MyCustomerSetDateOfBirthActionImpl();
    }
    

    public static MyCustomerSetDateOfBirthActionImpl of(final MyCustomerSetDateOfBirthAction template) {
        MyCustomerSetDateOfBirthActionImpl instance = new MyCustomerSetDateOfBirthActionImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    default <T> T withMyCustomerSetDateOfBirthAction(Function<MyCustomerSetDateOfBirthAction, T> helper) {
        return helper.apply(this);
    }
}
