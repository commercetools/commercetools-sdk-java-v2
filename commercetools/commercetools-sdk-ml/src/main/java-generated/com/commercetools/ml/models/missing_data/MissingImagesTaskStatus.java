package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.common.TaskStatusEnum;
import com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResult;
import java.time.ZonedDateTime;
import com.commercetools.ml.models.missing_data.MissingImagesTaskStatusImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MissingImagesTaskStatusImpl.class)
public interface MissingImagesTaskStatus  {

    
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
    public MissingImagesPagedQueryResult getResult();

    public void setState(final TaskStatusEnum state);
    
    public void setExpires(final ZonedDateTime expires);
    
    public void setResult(final MissingImagesPagedQueryResult result);

    public static MissingImagesTaskStatusImpl of(){
        return new MissingImagesTaskStatusImpl();
    }
    

    public static MissingImagesTaskStatusImpl of(final MissingImagesTaskStatus template) {
        MissingImagesTaskStatusImpl instance = new MissingImagesTaskStatusImpl();
        instance.setState(template.getState());
        instance.setExpires(template.getExpires());
        instance.setResult(template.getResult());
        return instance;
    }

}
