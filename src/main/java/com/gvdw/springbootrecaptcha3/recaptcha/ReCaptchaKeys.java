package com.gvdw.springbootrecaptcha3.recaptcha;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created By Gullian Van Der Walt at 08:05 on Apr, 2021
 */
@Component
@ConfigurationProperties(prefix = "google.recaptcha.key")
public class ReCaptchaKeys {

    private String site;
    private String secret;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
