package org.pac4j.core.client.unauthenticated;

import org.pac4j.core.client.IndirectClient;
import org.pac4j.core.context.WebContext;
import org.pac4j.core.credentials.AnonymousCredentials;
import org.pac4j.core.profile.CommonProfile;
import org.pac4j.core.redirect.RedirectAction;

public class RedirectUnauthenticatedClient extends IndirectClient<AnonymousCredentials, CommonProfile> {
    private final String url;

    public RedirectUnauthenticatedClient(String url){
        this.url = url;
    }

//    @Override
//    public final HttpAction redirect(final WebContext context) throws HttpAction {
//        final RedirectAction action = getRedirectAction(context);
//        return action.perform(context);
//    }

    @Override
    protected void clientInit(WebContext context) {
        defaultRedirectActionBuilder(webContext ->  RedirectAction.redirect(url));
        defaultCredentialsExtractor(webContext -> null);
        defaultAuthenticator( (c, wc) -> {});
    }

}
