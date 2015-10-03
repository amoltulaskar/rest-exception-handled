package com.training.component.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created with IntelliJ IDEA.
 * User: tulaska
 * Date: 2/10/15
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class errormessage {
    public String errorMessage = null;
    public Long errorCode = null;
    public String docLink = null;
    public String errorId = null;

    @JsonProperty("error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    public errormessage setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    @JsonProperty("error_code")
    public Long getErrorCode() {
        return errorCode;
    }

    public errormessage setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    @JsonProperty("doc")
    public String getDocLink() {
        return docLink;
    }

    public errormessage setDocLink(String docLink) {
        this.docLink = docLink;
        return this;
    }

    @JsonProperty("error_id")
    public String getErrorId() {
        return errorId;
    }

    public errormessage setErrorId(String errorId) {
        this.errorId = errorId;
        return this;
    }
}
