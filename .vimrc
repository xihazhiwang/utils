" 语法高亮
syntax on

" 关键字高亮
syntax enable

" 显示行号
set number

" 保持光标上下最少行数
set scrolloff=5

" 高亮当前行
set cursorline

" 显示当前mode
set showmode

hi clear SignColumn             " 标记列背景和主题背景匹配
hi clear LineNr                 " 当前行列背景和主题背景匹配

if has('cmdline_info')
    set showcmd                 " 右下角显示当前操作
    set ruler                   " 右下角显示状态说明
    set rulerformat=%30(%=\:b%n%y%m%r%w\ %l,%c%V\ %P%) " 设定格式
endif
