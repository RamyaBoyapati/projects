package com.infinite;

import javax.ejb.Remote;

@Remote
public interface InfiniteHelloWorldRemote {
          String Hello();
          
}
