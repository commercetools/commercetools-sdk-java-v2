package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SqsDestinationImpl implements SqsDestination {

    private String type;
    
    private String accessKey;
    
    private String accessSecret;
    
    private String queueUrl;
    
    private String region;

    @JsonCreator
    SqsDestinationImpl(@JsonProperty("accessKey") final String accessKey, @JsonProperty("accessSecret") final String accessSecret, @JsonProperty("queueUrl") final String queueUrl, @JsonProperty("region") final String region) {
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.queueUrl = queueUrl;
        this.region = region;
        this.type = "SQS";
    }
    public SqsDestinationImpl() {
        this.type = "SQS";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getAccessKey(){
        return this.accessKey;
    }
    
    
    public String getAccessSecret(){
        return this.accessSecret;
    }
    
    
    public String getQueueUrl(){
        return this.queueUrl;
    }
    
    
    public String getRegion(){
        return this.region;
    }

    public void setAccessKey(final String accessKey){
        this.accessKey = accessKey;
    }
    
    public void setAccessSecret(final String accessSecret){
        this.accessSecret = accessSecret;
    }
    
    public void setQueueUrl(final String queueUrl){
        this.queueUrl = queueUrl;
    }
    
    public void setRegion(final String region){
        this.region = region;
    }

}
