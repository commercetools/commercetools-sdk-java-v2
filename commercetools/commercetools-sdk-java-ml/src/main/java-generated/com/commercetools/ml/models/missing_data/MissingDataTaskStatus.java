package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.common.TaskStatusEnum;
import com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResult;
import java.time.ZonedDateTime;
import com.commercetools.ml.models.missing_data.MissingDataTaskStatusImpl;

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
*  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MissingDataTaskStatusImpl.class)
public interface MissingDataTaskStatus  {

    
    @NotNull
    @JsonProperty("state")
    public TaskStatusEnum getState();
    /**
    *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
    */
    @NotNull
    @JsonProperty("expires")
    public ZonedDateTime getExpires();
    /**
    *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("result")
    public MissingAttributesPagedQueryResult getResult();

    public void setState(final TaskStatusEnum state);
    
    public void setExpires(final ZonedDateTime expires);
    
    public void setResult(final MissingAttributesPagedQueryResult result);

    public static MissingDataTaskStatusImpl of(){
        return new MissingDataTaskStatusImpl();
    }
    

    public static MissingDataTaskStatusImpl of(final MissingDataTaskStatus template) {
        MissingDataTaskStatusImpl instance = new MissingDataTaskStatusImpl();
        instance.setState(template.getState());
        instance.setExpires(template.getExpires());
        instance.setResult(template.getResult());
        return instance;
    }

    default <T> T withMissingDataTaskStatus(Function<MissingDataTaskStatus, T> helper) {
        return helper.apply(this);
    }
}
