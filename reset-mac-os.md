####之前重新安装了mbp的系统，记录一下自己配置环境的一些过程
+ 安装brew

+ 安装scroll-reverser，需要在安全性与隐私-辅助功能勾选scroll-reverser

+ 启动tomcat报错，需要在VM options：-Djava.net.preferIPv4Stack=true

+ 安装zsh 和 oh-my-zsh [sh -c "$(curl -fsSL https://raw.github.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"]

+ 安装zsh主题 [powerlevel9k](https://github.com/Powerlevel9k/powerlevel9k)

+ 安装zsh字体 [nert-font](https://github.com/ryanoasis/nerd-fonts)

+ Zsh命令自动补全插件 zsh-autosuggestions(zsh-autosuggestions) [git clone https://github.com/zsh-users/zsh-autosuggestions $ZSH_CUSTOM/plugins/zsh-autosuggestions]

Zsh命令语法高亮插件 zsh-syntax-highlighting(zsh-syntax-highlighting) [git clone https://github.com/zsh-users/zsh-syntax-highlighting.git $ZSH_CUSTOM/plugins/zsh-syntax-highlighting]