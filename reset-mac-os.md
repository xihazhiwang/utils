####之前重新安装了mbp的系统，记录一下自己配置环境的一些过程
+ 安装brew

+ 安装scroll-reverser，需要在安全性与隐私-辅助功能勾选scroll-reverser

+ 启动tomcat报错，需要在VM options：-Djava.net.preferIPv4Stack=true

+ 安装zsh 和 oh-my-zsh [sh -c "$(curl -fsSL https://raw.github.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"]

+ 安装zsh主题 powerlevel9k []

+ 安装zsh字体 nert-font

# 先執行這行，才能用 homebrew 安裝字型。曾經執行過的人可以跳過這個指令
brew tap caskroom/fonts
# 安裝指令
brew cask install font-sourcecodepro-nerd-font