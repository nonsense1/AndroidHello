package cn.com.sdzs.helloworld.dagger;

import cn.com.sdzs.helloworld.EntryActivity;
import dagger.Component;
import dagger.Module;

@Component
public interface FactoryActivityComponent {
    void inject(EntryActivity entryActivity);
}
